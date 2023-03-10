package danh_sach_hoc_sinh;

import java.util.Scanner;

public class Student {
    static String[][] studenList=new String[2][3];
    public void add(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten: ");
        String name=scanner.nextLine();
        System.out.println("nhap lop: ");
        String classes=scanner.nextLine();
        StudentList studentList=new StudentList(id, name, classes);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < studenList[i].length; j++) {
                if (studenList==null){
                    studenList[i][j]=studentList;
                }
            }
        }
//        System.out.println(studenList.toString());
    }
}
