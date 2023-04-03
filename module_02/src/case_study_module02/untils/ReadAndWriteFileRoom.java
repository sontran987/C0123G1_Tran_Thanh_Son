package case_study_module02.untils;

import case_study_module02.models.Room;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteFileRoom {
    public static LinkedHashMap<Room, Integer> readedFileRoom(String pathFile) {
        File file = new File(pathFile);
        BufferedReader bufferedReader = null;
        LinkedHashMap<Room, Integer> linkedHashMap = new LinkedHashMap<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String []splitData=line.split(",");
                linkedHashMap.put(new Room(splitData[0],splitData[1],Double.parseDouble(splitData[2]),Double.parseDouble(splitData[3]),
                        Integer.parseInt(splitData[4]),splitData[5],splitData[6]), Integer.parseInt(splitData[7]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return linkedHashMap;
    }
    public static void writeFileRoom(String pathFile,LinkedHashMap<Room,Integer>linkedHashMap){
        File file=new File(pathFile);
        BufferedWriter bufferedWriter=null;
        LinkedHashMap<Room,Integer>linkedHashMap1=new LinkedHashMap<Room,Integer>(linkedHashMap){
            @Override
            public String toString() {
                Iterator<Map.Entry<Room,Integer>> i = entrySet().iterator();
                if (! i.hasNext())
                    return "{}";

                StringBuilder sb = new StringBuilder();
                for (;;) {
                    Map.Entry<Room,Integer> e = i.next();
                    Room key = e.getKey();
                    Integer value = e.getValue();
                    sb.append(key ==null ? "(this Map)" : key);
                    sb.append('=');
                    sb.append(value ==null ? "(this Map)" : value);
                    if (! i.hasNext())
                        return sb.append('\n').toString();
                    sb.append(',').append('\n');
                }
            }
        };
        try {
            bufferedWriter=new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(linkedHashMap.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
