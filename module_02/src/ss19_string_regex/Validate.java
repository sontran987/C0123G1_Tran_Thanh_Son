package ss19_string_regex;

import java.util.Scanner;

public class Validate {
    static final String REGEX ="^(A|C|P)[0-9]{4}(G|H|I|K)$";

    public static void main(String[] args) {
        boolean flag = false;
       do {
           Scanner scanner =new Scanner(System.in);
           System.out.println("Enter name class:");
           String name= scanner.nextLine();
           if (validateName(name)){
               flag=true;
               System.out.println("valid class name");
           }else{
               System.out.println("invalid class name");
           }
       }while(!flag);
    }
    public static boolean validateName(String nameClass){
        return nameClass.matches(REGEX);
    }
}
