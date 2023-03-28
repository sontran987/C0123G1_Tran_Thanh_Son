package ss17_binary_file.quan_ly_san_pham_file_nhi_phan.repo;

import ss17_binary_file.quan_ly_san_pham_file_nhi_phan.modul.Product1;
import ss17_binary_file.quan_ly_san_pham_file_nhi_phan.util.ReadAndWrite;

import java.util.List;

public class ProductRepo implements IProductRepo {
    static final String FILE_PRODUCT = "src\\ss17_binary_file\\quan_ly_san_pham_file_nhi_phan\\data\\product1_file.dat";

    static List<Product1> list = ReadAndWrite.readFileBinary(FILE_PRODUCT);

    @Override
    public void add(Product1 product1) {
        ReadAndWrite.writeListProductToFile(FILE_PRODUCT, list);
    }

    @Override
    public List<Product1> getAllDisplay() {
        return list;

    }

    @Override
    public void searchRepo(String name) {
        boolean flag =true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNameProduct() == name) {
                System.out.println(list.get(i));
                flag=false;
            }
        }if (flag){
            System.out.println("No in the file");
        }
    }
}
