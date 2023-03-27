package ss17_binary_file.copy_file_nhi_phan;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> readFileBinary(String pathFile) {
        List<String> list = new ArrayList<>();
        File file = new File(pathFile);
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length() > 0) {
                objectInputStream = new ObjectInputStream(Files.newInputStream(file.toPath()));
                list =(List<String>)objectInputStream.readObject();
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void writeFileBinary(String pathFile, List<String> list){
        File file =new File(pathFile);
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream=new ObjectOutputStream(Files.newOutputStream(file.toPath()));
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
