package case_study_module02.untils;

import case_study_module02.models.Contract;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReadAndWriteFlieContract {
    public static Queue<Contract> readerFileContract(String pathFile) {
        File file = new File(pathFile);
        Queue<Contract> contracts = new PriorityQueue<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                contracts.add(new Contract(Integer.parseInt(splitData[0]), Integer.parseInt(splitData[1]),
                        Double.parseDouble(splitData[2]), Double.parseDouble(splitData[3]), Integer.parseInt(splitData[4])));

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contracts;
    }
    public static void writeFileContract(String pathFile,Contract contract){
        File file=new File(pathFile);
        BufferedWriter bufferedWriter=null;
        try{
            bufferedWriter=new BufferedWriter(new FileWriter(file,true));
            bufferedWriter.write(contract.getInfoToCSV());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileContractToList(String pathFile,Queue<Contract> contracts){
        File file=new File(pathFile);
        BufferedWriter bufferedWriter=null;
        try{
            bufferedWriter=new BufferedWriter(new FileWriter(file,false));
            for (Contract c:contracts) {
                bufferedWriter.write(c.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
