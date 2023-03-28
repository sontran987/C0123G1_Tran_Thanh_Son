package ss17_binary_file.quan_ly_san_pham_file_nhi_phan.modul;

import java.io.Serializable;

public class Product1 implements Serializable {
    private int codeProduct;
    private String nameProduct;
    private double price;
    private String producedGoods;
    private String describe;

    public Product1() {
    }

    public Product1(int codeProduct, String nameProduct, double price, String producedGoods, String describe) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.producedGoods = producedGoods;
        this.describe = describe;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducedGoods() {
        return producedGoods;
    }

    public void setProducedGoods(String producedGoods) {
        this.producedGoods = producedGoods;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product1: " +
                " codeProduct= " + codeProduct +
                ", nameProduct= " + nameProduct +
                ", price= " + price +
                ", producedGoods= " + producedGoods +
                ", describe= " + describe;
    }

    public String getInfoToString() {
        return codeProduct +
                "," + nameProduct +
                "," + price +
                "," + producedGoods +
                "," + describe;
    }
}
