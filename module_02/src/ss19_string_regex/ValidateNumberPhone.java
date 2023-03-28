package ss19_string_regex;

import java.util.Scanner;

public class ValidateNumberPhone {
    public static void main(String[] args) {
        boolean flag=false;
       do {
           Scanner scanner =new Scanner(System.in);
           System.out.println("Enter number phone: ");
           String phone= scanner.nextLine();
           if (validateNumber(phone)){
               flag=true;
               System.out.println("valid number phone");
           }else{
               System.out.println("invalid number phone");
           }
       }while(!flag);
    }
    public static boolean validateNumber(String number){
        String regEx="^\\([0-9]{2}\\)(-)\\(0[0-9]{9}\\)$";
        return number.matches(regEx);
    }
}
