package ss17_binary_file.quan_ly_san_pham_file_nhi_phan.util;

import ss17_binary_file.quan_ly_san_pham_file_nhi_phan.modul.Product1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Product1> readFileBinary(String pathFile) {
        List<Product1> product1List = new ArrayList<>();
        File file = new File(pathFile);
        ObjectInputStream oIS = null;
        try {
            if (file.length() > 0) {
                oIS = new ObjectInputStream(new FileInputStream(file));
                product1List = (List<Product1>) oIS.readObject();
                oIS.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product1List;
    }

    public static void writeListProductToFile(String pathFile, List<Product1> product1List) {
        File file = new File(pathFile);
        ObjectOutputStream oOS = null;
        try {
            oOS = new ObjectOutputStream(new FileOutputStream(file));
            oOS.writeObject(product1List);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oOS.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
