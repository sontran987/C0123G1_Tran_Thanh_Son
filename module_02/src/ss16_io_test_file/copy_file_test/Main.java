package ss16_io_test_file.copy_file_test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static final String SOURCE_FILE_LINK = "D:\\codegym\\C0123G1_Tran_Thanh_Son\\module_02\\src\\ss16_io_test_file\\copy_file_test\\source_file.dat.txt";
    static final String TARGET_FILE_LINK = "D:\\codegym\\C0123G1_Tran_Thanh_Son\\module_02\\src\\ss16_io_test_file\\copy_file_test\\target_file.txt";

    public static void main(String[] args) {
        writeToFileTarget(readToFileSource(), true);
    }

    public static List<String> readToFileSource() {
        File file = new File(SOURCE_FILE_LINK);
        List<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
        return list;
    }

    public static void writeToFileTarget(List<String> list, boolean append) {
        File file = new File(TARGET_FILE_LINK);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, append));
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException ioException) {
                throw new RuntimeException(ioException);
            }
        }
    }
}
