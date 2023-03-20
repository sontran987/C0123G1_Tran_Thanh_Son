package ss12_java_collection_framewrork.practice_use_array_list_linked_list_in_java_collection_framework.controller;

import ss12_java_collection_framewrork.practice_use_array_list_linked_list_in_java_collection_framework.service.ProductManager;

import java.util.Scanner;

public class MenuProduct {
    public static void menuProduct() {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choose;
        do {
            System.out.println(
                    "1. Add product new\n" +
                            "2. Edit name product\n" +
                            "3. Delete product\n" +
                            "4. Display list product\n" +
                            "5. Seach name product\n" +
                            "6. Price product ascending\n" +
                            "7. Price product descending\n" +
                            "8. Exit");
            System.out.println("Enter the number corresponding to the function:");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.editProduct();
                    break;
                case 3:
                    productManager.deleteProduct();
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    productManager.seachProduct();
                    break;
                case 6:
                    productManager.priceAscending();
                    break;
                case 7:
                    productManager.priceDescending();
                    break;
                case 8:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Please re-enter:");
            }
        } while (choose != 8);
    }
}
