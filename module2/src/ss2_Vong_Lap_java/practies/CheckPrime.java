package ss2_Vong_Lap_java.practies;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while(1>0) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime");
        }else{
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
        }
    }
}

