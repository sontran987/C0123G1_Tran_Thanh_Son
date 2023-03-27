package ss17_binary_file.copy_file_nhi_phan;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    static final String SOURCE ="src/ss17_binary_file/copy_file_nhi_phan/source_file.dat";
    static final String TARGET ="src/ss17_binary_file/copy_file_nhi_phan/target_file.dat";
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap string:");
        String str= scanner.nextLine();
        str= String.valueOf(str.split(""));
        list.add(str);
        ReadAndWriteFile.writeFileBinary(SOURCE,list);
        ReadAndWriteFile.writeFileBinary(TARGET, ReadAndWriteFile.readFileBinary(SOURCE));
    }
}
