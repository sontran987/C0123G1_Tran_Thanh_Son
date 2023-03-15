package ss8_cleancode_refactoring.practices;

import java.util.Scanner;

public class Calculator {
    public static int calculate(int firstOperand, int secondOperand,char operator){
        char opertor = 0;
        switch(opertor){
            case'+':
                return firstOperand+secondOperand;
            case '-':
                return firstOperand-secondOperand;
            case'*':
                return firstOperand*secondOperand;
            case'/':
                if (secondOperand!=0){
                    return firstOperand/secondOperand;
                }else {
                    throw new RuntimeException("Can not divide by 0");
                }
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
