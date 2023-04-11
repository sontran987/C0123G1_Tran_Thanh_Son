package bai_3.utils;

import bai_3.modules.ThongTinHoaDon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteHoaDon {
    public static List<ThongTinHoaDon> readFile() {
        File file = new File("D:\\codegym\\C0123G1_Tran_Thanh_Son\\kiem_tra\\src\\bai_3\\data\\hoa_don.csv");
        BufferedReader bufferedReader = null;
        List<ThongTinHoaDon> list = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                list.add(new ThongTinHoaDon(splitData[0], splitData[1], splitData[2], Long.parseLong(splitData[3])));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(ThongTinHoaDon tinHoaDon) {
        File file = new File("D:\\codegym\\C0123G1_Tran_Thanh_Son\\kiem_tra\\src\\bai_3\\data\\hoa_don.csv");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(String.valueOf(tinHoaDon.getToCSV()));
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
