package ss16_io_test_file.doc_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String link = "D:\\codegym\\C0123G1_Tran_Thanh_Son\\module_02\\src\\ss16_io_test_file\\doc_file\\list_nation.csv";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter code:");
        String code = scanner.nextLine();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        Nation nation = new Nation(id, code, name);
        String nationStr = nation.toString();
        write(link, nationStr, true);
        read(link);

    }

    public static void write(String listNation, String test, boolean append) {

        File file = new File(listNation);
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file, append));
            bw.write(test);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void read(String listNation) {
        File file = new File(listNation);
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                printlnNation(parseCvsLine(line));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (br == null)
                    br.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<String> parseCvsLine(String cvsLine) {
        List<String> result = new ArrayList<>();
        if (cvsLine != null) {
            String[] splitData = cvsLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static void printlnNation(List<String> nation) {
        List<Nation> list = new ArrayList<>();
        list.add(new Nation(Integer.parseInt(nation.get(0)), nation.get(1), nation.get(2)));
        for (Nation n : list) {
            System.out.println(n);
        }
        list.toString();
    }
}
