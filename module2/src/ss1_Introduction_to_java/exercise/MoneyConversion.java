package ss1_Introduction_to_java.exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MoneyConversion {
    public static void main(String[] args){
        System.out.println("Nhập số tiền: USD");
        Scanner scanner=new Scanner(System.in);
        int money=Integer.parseInt(scanner.nextLine())*23000;
        System.out.println("Số tiền Việt Nam là: "+ money);
    }
}
