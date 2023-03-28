package ss19_string_regex;

import java.util.Scanner;

public class ValidName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String name = scanner.nextLine();
        if (validFullName(name)) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
        }
    }

    public static boolean validFullName(String name) {
        String regEx = "^([A-Z][a-z]*)(\\s([A-Z][a-z]*)*)$";
        return name.matches(regEx);
    }
}
