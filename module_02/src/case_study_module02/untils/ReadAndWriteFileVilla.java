package case_study_module02.untils;

import case_study_module02.models.Facility;
import case_study_module02.models.Villa;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteFileVilla {
    public static LinkedHashMap<Villa, Integer> readFileVilla(String pathFile) {
        File file = new File(pathFile);
        BufferedReader bufferedReader = null;
        LinkedHashMap<Villa, Integer> linkedHashMap = new LinkedHashMap<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] splitData = line.split(",");
                linkedHashMap.put(new Villa(splitData[0], splitData[1], Double.parseDouble(splitData[2]),
                        Double.parseDouble(splitData[3]), Integer.parseInt(splitData[4]),
                        splitData[5], splitData[6], Double.parseDouble(splitData[7]),
                        Integer.parseInt(splitData[8])), Integer.parseInt(splitData[9]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return linkedHashMap;
    }

    public static void writeFileVilla(String pathFile, LinkedHashMap<Villa, Integer> listVilla) {
        File file = new File(pathFile);
        BufferedWriter bufferedWriter = null;
        LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<Villa, Integer>(listVilla) {
            @Override
            public String toString() {
                Iterator<Map.Entry<Villa, Integer>> i = entrySet().iterator();
                if (!i.hasNext())
                    return "{}";

                StringBuilder sb = new StringBuilder();
                for (; ; ) {
                    Map.Entry<Villa, Integer> e = i.next();
                    Villa key = e.getKey();
                    Integer value = e.getValue();
                    sb.append(key == null ? "(this Map)" : key);
                    sb.append(',');
                    sb.append(value == null ? "(this Map)" : value);
                    if (!i.hasNext())
                        return sb.toString();
                    sb.append(',').append('\n');
                }
            }
        };
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, false));
            bufferedWriter.write(String.valueOf(villaIntegerLinkedHashMap));
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
