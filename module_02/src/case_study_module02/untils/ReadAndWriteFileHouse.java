package case_study_module02.untils;

import case_study_module02.models.House;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteFileHouse {
    public static LinkedHashMap<House, Integer> readFileHouse(String pathFile) {
        File file = new File(pathFile);
        BufferedReader bufferedReader = null;
        LinkedHashMap<House, Integer> linkedHashMap = new LinkedHashMap<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                linkedHashMap.put(new House(splitData[0], splitData[1], Double.parseDouble(splitData[2]),
                        Double.parseDouble(splitData[3]), Integer.parseInt(splitData[4]), splitData[5],
                        splitData[6], Integer.parseInt(splitData[7])), Integer.parseInt(splitData[8]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return linkedHashMap;
    }

    public static void writedFileHouse(String pathFile, LinkedHashMap<House, Integer> linkedHashMap) {
        File file = new File(pathFile);
        BufferedWriter bufferedwriter = null;
        LinkedHashMap<House, Integer> linkedHashMap1 = new LinkedHashMap<House, Integer>(linkedHashMap) {
            @Override
            public String toString() {
                Iterator<Map.Entry<House, Integer>> i = entrySet().iterator();
                if (!i.hasNext())
                    return "{}";
                StringBuilder sb = new StringBuilder();
                for (; ; ) {
                    Map.Entry<House, Integer> e = i.next();
                    House key = e.getKey();
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
            bufferedwriter = new BufferedWriter(new FileWriter(file, false));
            bufferedwriter.write(String.valueOf(linkedHashMap1));
            bufferedwriter.newLine();
            bufferedwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
