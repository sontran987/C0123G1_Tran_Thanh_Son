package ss11_stack_queue.exercies.dao_nguoc_phan_tu_mang_su_dung_stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        number();
        string();
    }

    public static void number() {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("nhap so cho phan tu: ");
            int num = scanner.nextInt();
            stack.push(num);
        }
        System.out.println(stack);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stack1.push(stack.pop());
        }
        stack = stack1;
        System.out.println("Mảng số đảo: " + stack);
    }

    public static void string() {
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chuỗi ký tự: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            stack.push(String.valueOf(str.charAt(i)));
        }

        System.out.println(stack);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stack1.push(stack.pop());
        }
        stack = stack1;
        System.out.println("Mảng ký tự đảo: " + stack);
        String string = "";
        for (String i : stack) {
            string += i;
        }
        System.out.println("chuoi dao nguoc: " + string);
    }

}
