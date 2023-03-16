package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (1 > 0) {
            System.out.println("Nhập số muốn đọc(0-999): ");
            String number = scanner.nextLine();
            while (!(number.matches("^[1-9][0-9]?[0-9]$") ||
                    number.matches("^[0-9]$"))) {
                System.out.println("Khong hop le!");
                System.out.println("nhap so can doc (0-999):");
                number = scanner.nextLine();
            }
            String[] numberRay = number.split("");
            switch (numberRay.length) {
                case 1:
                    if (numberRay[0].equals("0")) {
                        System.out.println("zero");
                    } else {
                        System.out.println(nameDown(numberRay[0]));
                    }
                    break;
                case 2:
                    System.out.println(nameUp(numberRay[0], nameDown(numberRay[1])));
                    break;
                case 3:
                    if ((numberRay[1].equals("0") && (numberRay[2].equals("0")))) {
                        System.out.println(hunredUp(numberRay[0]));
                    } else {
                        System.out.printf(hunredUp(numberRay[0]));
                        System.out.println(" and " + nameUp(numberRay[1], nameDown(numberRay[2])));
                    }
            }

        }
    }

    private static String nameDown(String number) {
        switch (number) {
            case "0":
                return "";
            case "1":
                return "one";
            case "2":
                return "two";
            case "3":
                return "three";
            case "4":
                return "four";
            case "5":
                return "five";
            case "6":
                return "six";
            case "7":
                return "seven";
            case "8":
                return "eight";
            case "9":
                return "nine";
            default:
                return "can't read this";
        }
    }

    private static String nameUp(String number, String previous) {
        switch (number) {
            case "0":
                return previous;
            case "1":
                switch (previous) {
                    case "":
                        return "ten";
                    case "one":
                        return "eleven";
                    case "two":
                        return "twelve";
                    case "three":
                        return "thirdteen";
                    case "five":
                        return "fifteen";
                    default:
                        return previous + "teen";
                }
            case "2":
                return "twenty" + previous;
            case "3":
                return "thirdty " + previous;
            default:
                return nameDown(number) + "ty" + " " + previous;
        }
    }

    private static String hunredUp(String number) {
        return nameDown(number) + "hunred";
    }
}
