package ss17_binary_file.quan_ly_san_pham_file_nhi_phan.services;

import ss17_binary_file.quan_ly_san_pham_file_nhi_phan.moduls.Product1;
import ss17_binary_file.quan_ly_san_pham_file_nhi_phan.repo.ProductRepo;

import java.util.List;
import java.util.Scanner;

public class IProduct1Service implements Service {
    ProductRepo productRepo = new ProductRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Enter code product:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name product");
        String name = scanner.nextLine();
        System.out.println("Enter price product:");
        double price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter produced goods:");
        String producedGoods = scanner.nextLine();
        System.out.println("Enter describe:");
        String describe = scanner.nextLine();
        Product1 product1 = new Product1(id, name, price, producedGoods, describe);
        productRepo.add(product1);
    }

    @Override
    public void display() {
        List<Product1> list = productRepo.getAllDisplay();
        for (Product1 p : list) {
            System.out.println(p);
        }
    }

    @Override
    public void search() {
        System.out.println("Enter id search: ");
        String name = scanner.nextLine();
        productRepo.searchRepo(name);
    }
}
