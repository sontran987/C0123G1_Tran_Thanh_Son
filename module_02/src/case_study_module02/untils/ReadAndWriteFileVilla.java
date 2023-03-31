package case_study_module02.untils;

import case_study_module02.models.Villa;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadAndWriteFileVilla {
    public static LinkedHashMap<Villa,Integer> readFileVilla(String pathFile){
        File file=new File(pathFile);
        BufferedReader bufferedReader=null;
        LinkedHashMap<Villa,Integer> linkedHashMap=new LinkedHashMap<>();
        try {
            String line=null;

            bufferedReader=new BufferedReader(new FileReader(file));
            while((line= bufferedReader.readLine())!=null){

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return linkedHashMap;
    }
    public static void  writeFileVilla(String pathFile,LinkedHashMap<Villa,Integer> listVilla){

    }
}
