package ss12_java_collection_framewrork.practice_use_array_list_linked_list_in_java_collection_framework.service;

import ss12_java_collection_framewrork.practice_use_array_list_linked_list_in_java_collection_framework.modul.Product;

import java.util.Comparator;

public class ProductSortPriceDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()- o1.getPrice();
    }
}
