package lesson14.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse <T extends Product>{
    private List<T> products = new ArrayList<>();

    public List<T> getProducts() {
        return products;
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public boolean removeProduct(T product) {
        return products.remove(product);
    }

    public double calculateTotalValue() {
        double total = 0;
        for (T product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
