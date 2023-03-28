package ss17_binary_file.quan_ly_san_pham_file_nhi_phan.repo;

import ss17_binary_file.quan_ly_san_pham_file_nhi_phan.modul.Product1;

import java.util.List;

public interface IProductRepo {
    void add(Product1 product1);

    List<Product1> getAllDisplay();

    void searchRepo(String id);
}
