package ss5_access_modifier_static_method_static_property.exercises.xay_dung_lop_chi_ghi_trong_java;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name= scanner.nextLine();
        System.out.println("Enter class: ");
        String classes =scanner.nextLine();
        Student student=new Student(name,classes);
        System.out.println(student.toString());
    }
}
