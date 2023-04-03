package case_study_module02.untils;

import case_study_module02.models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCustomer {
    public static void writeFileCustomer(String pathFile, List<Customer> listCustomer) {
        File file = new File(pathFile);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file,false));
            for (Customer c : listCustomer) {
                bufferedWriter.write(c.getInfoToCSV());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Customer> readerFileCustomer(String pathFile) {
        ArrayList<Customer> arrayList = new ArrayList<>();
        File file = new File(pathFile);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String []splitData=line.split(",");
               arrayList.add(new Customer(Integer.parseInt(splitData[0]),splitData[1],splitData[2],splitData[3],
                       Integer.parseInt(splitData[4]),splitData[5],splitData[6],splitData[7],splitData[8]));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }
}