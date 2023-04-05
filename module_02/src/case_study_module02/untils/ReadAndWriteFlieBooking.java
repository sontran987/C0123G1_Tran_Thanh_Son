package case_study_module02.untils;

import case_study_module02.models.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteFlieBooking {
    public static Set<Booking> readFileBooking(String pathFile) {
        File file = new File(pathFile);
        BufferedReader bufferedReader = null;
        Set<Booking> listBooking = new TreeSet<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                listBooking.add(new Booking(Integer.parseInt(splitData[0]), splitData[1],
                        splitData[2], Integer.parseInt(splitData[3]), splitData[4], splitData[5]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listBooking;
    }
    public static void writeFileBooking(String pathFile,Booking bookings){
        File file=new File(pathFile);
        BufferedWriter bufferedWriter=null;
        try{
            bufferedWriter=new BufferedWriter(new FileWriter(file,true));
            bufferedWriter.write(bookings.getInfoToCSV());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
