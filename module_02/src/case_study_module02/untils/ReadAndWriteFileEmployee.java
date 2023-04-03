package case_study_module02.untils;

import case_study_module02.models.Employee;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileEmployee {
    public static void writeFileEmployee(String pathFile, List<Employee> listEmployee) {
        File file = new File(pathFile);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file,false));
            for (Employee e : listEmployee) {
                bufferedWriter.write(e.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Employee> readedFileEmployee(String pathFile) {
        File file = new File(pathFile);
        BufferedReader bufferedReader = null;
        ArrayList<Employee> arrayList = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                arrayList.add(new Employee(Integer.parseInt(splitData[0]), splitData[1], splitData[2],
                        splitData[3], Integer.parseInt(splitData[4]), splitData[5], splitData[6],
                        splitData[7], splitData[8], Long.parseLong(splitData[9])));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }
}
