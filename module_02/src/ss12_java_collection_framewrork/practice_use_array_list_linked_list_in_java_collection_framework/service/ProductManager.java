package ss12_java_collection_framewrork.practice_use_array_list_linked_list_in_java_collection_framework.service;

import ss12_java_collection_framewrork.practice_use_array_list_linked_list_in_java_collection_framework.modules.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class ProductManager implements Functions {
    Scanner scanner = new Scanner(System.in);
    static LinkedList<Product> listProduct = new LinkedList<>();

    static {
        listProduct.add(new Product(1, "iphone5", 1200));
        listProduct.add(new Product(2, "iphone12", 30000));
        listProduct.add(new Product(3, "iphone13", 3000000));
        listProduct.add(new Product(4, "iphone14", 30000000));
    }

    @Override
    public void addProduct() {
        int id;
        boolean flag = true;
        do {
            System.out.println("Enter in id: ");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < listProduct.size(); i++) {
                if (id == listProduct.get(i).getId()) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        } while (!flag);
        System.out.println("Enter in name: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter in price: ");
        int priceProduct = Integer.parseInt(scanner.nextLine());
        listProduct.add(new Product(id, nameProduct, priceProduct));


    }

    @Override
    public void editProduct() {
        System.out.println("Enter id product to fix : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                System.out.println("Enter in name: ");
                String nameProduct = scanner.nextLine();
                System.out.println("Enter in price: ");
                int priceProduct = Integer.parseInt(scanner.nextLine());
                listProduct.set(i, new Product(id, nameProduct, priceProduct));
                System.out.println("edited.");
            }
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Enter id product to delete : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                listProduct.remove(i);
                System.out.println("deleted. ");
            }
        }
    }

    @Override
    public void displayProduct() {
        for (Product p : listProduct) {
            System.out.println(p);
        }
    }

    @Override
    public void seachProduct() {
        System.out.println("Enter name product you want to find: ");
        String name = scanner.nextLine();
        for (Product p : listProduct) {
            if (Objects.equals(p.getName(), name)) {
                System.out.println(p);
                break;
            } else {
                System.out.println("The product is not in the list.\n");
                break;
            }
        }
//
    }

    @Override
    public void priceAscending() {
        for (int i = 0; i < listProduct.size(); i++) {
            listProduct.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
            System.out.println(listProduct.get(i));
        }
    }

    @Override
    public void priceDescending() {
        for (int i = 0; i < listProduct.size(); i++) {
            listProduct.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
            System.out.println(listProduct.get(i));
        }
    }
}
